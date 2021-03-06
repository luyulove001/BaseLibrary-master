package talex.zsw.baselibrary.view.MagicProgress;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import junit.framework.Assert;

import java.lang.ref.WeakReference;

/**
 * 项目包名: talex.zsw.baselibrary.view.MagicProgress
 * 作者: 赵小白 email:edisonzsw@icloud.com 
 * 日期: 16/4/21 17:29 
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class SmoothHandler extends Handler
{
	final WeakReference<ISmoothTarget> targetWeakReference;

	private float aimPercent;
	private float minInternalPercent = 0.03f; // 3%
	private float smoothInternalPercent = 0.01f; // 1%
	private int smoothIncreaseDelayMillis = 1; // 1ms

	public float getMinInternalPercent() {
		return minInternalPercent;
	}

	/**
	 * if the provider percent more than minInternalPercent, it will be split to the several smoothInternalPercent
	 *
	 * @param minInternalPercent the min internal of the percent, default 0.03
	 * @see #setSmoothInternalPercent(float)
	 */
	public void setMinInternalPercent(float minInternalPercent) {
		Assert.assertTrue("the min internal percent must more than 0", minInternalPercent > 0);
		Assert.assertTrue("the min internal percent must less than 1", minInternalPercent <= 1);
		Assert.assertTrue("the min internal percent must more than the smooth internal percent",
			minInternalPercent > this.smoothInternalPercent);
		this.minInternalPercent = minInternalPercent;
	}

	public float getSmoothInternalPercent() {
		return smoothInternalPercent;
	}

	/**
	 * if the provider percent more than minInternalPercent, it will be split to the several smoothInternalPercent
	 *
	 * @param smoothInternalPercent the internal of the percent will provide the smooth effect, default 0.01
	 * @see #setMinInternalPercent(float)
	 */
	public void setSmoothInternalPercent(float smoothInternalPercent) {
		Assert.assertTrue("the smooth internal percent must more than 0", minInternalPercent > 0);
		Assert.assertTrue("the smooth internal percent must less than 0.5", minInternalPercent < 0.5);
		Assert.assertTrue("the smooth internal percent must less than the min internal percent",
			smoothInternalPercent < this.minInternalPercent);
		this.smoothInternalPercent = smoothInternalPercent;
	}

	public int getSmoothIncreaseDelayMillis() {
		return smoothIncreaseDelayMillis;
	}

	/**
	 * @param smoothIncreaseDelayMillis the delay of increase duration, default 1ms
	 */
	public void setSmoothIncreaseDelayMillis(int smoothIncreaseDelayMillis) {
		Assert.assertTrue("the delay of increase duration must more than 0", minInternalPercent > 0);
		this.smoothIncreaseDelayMillis = smoothIncreaseDelayMillis;
	}

	/**
	 * generally use for the progress widget
	 *
	 * @param targetWeakReference the weak reference of the smooth target
	 */
	public SmoothHandler(WeakReference<ISmoothTarget> targetWeakReference) {
		this(targetWeakReference, Looper.getMainLooper());
	}

	public SmoothHandler(WeakReference<ISmoothTarget> targetWeakReference, Looper looper) {
		super(looper);
		this.targetWeakReference = targetWeakReference;
		this.aimPercent = targetWeakReference.get().getPercent();
	}

	@Override
	public void handleMessage(Message msg) {
		super.handleMessage(msg);
		if (this.targetWeakReference == null || this.targetWeakReference.get() == null) {
			return;
		}

		final ISmoothTarget target = targetWeakReference.get();

		setPercent2Target(Math.min(target.getPercent() + smoothInternalPercent, aimPercent));

		if (target.getPercent() >= this.aimPercent || target.getPercent() >= 1 ||
			(target.getPercent() == 0 && this.aimPercent == 0)) {
			clear();
			return;
		}

		sendEmptyMessageDelayed(0, smoothIncreaseDelayMillis);
	}

	private void clear() {
		this.ignoreCommit = false;
		removeMessages(0);
	}

	private boolean ignoreCommit = false;

	/**
	 * Must be invoked by some method which will change the percent for monitor all changes
	 * about percent.
	 *
	 * @param percent the percent will be effect by the target.
	 */
	public void commitPercent(float percent) {
		if (this.ignoreCommit) {
			this.ignoreCommit = false;
			return;
		}
		this.aimPercent = percent;
	}

	private void setPercent2Target(final float percent) {
		if (targetWeakReference == null || targetWeakReference.get() == null) {
			return;
		}

		this.ignoreCommit = true;
		targetWeakReference.get().setPercent(percent);
		this.ignoreCommit = false;
	}

	/**
	 * if the provider percent(the aim percent) more than minInternalPercent, it will be split to the several smoothInternalPercent
	 *
	 * @param percent the aim percent
	 */
	public void loopSmooth(float percent) {
		if (this.targetWeakReference == null || this.targetWeakReference.get() == null) {
			return;
		}

		final ISmoothTarget target = targetWeakReference.get();

		setPercent2Target(this.aimPercent);
		clear();

		this.aimPercent = percent;

		if (this.aimPercent - target.getPercent() > minInternalPercent) {
			sendEmptyMessage(0);
		} else {
			setPercent2Target(percent);
		}

	}
}
