package talex.zsw.baselibrary.view.RecyleView;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作用: 使RecyclerView使用GridLayoutManager嵌套在ScrollView中
 * 作者: TALE(赵小白) email:edisonzsw@icloud.com
 * 日期: 2015-08-28 13:58 
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class FullyStaggeredGridLayoutManager extends StaggeredGridLayoutManager
{
	private int mwidth = 0;
	private int mheight = 0;

	public FullyStaggeredGridLayoutManager(int spanCount, int orientation)
	{
		super(spanCount, orientation);
	}

	private int[] mMeasuredDimension = new int[2];

	public int getMwidth()
	{
		return mwidth;
	}

	public void setMwidth(int mwidth)
	{
		this.mwidth = mwidth;
	}

	public int getMheight()
	{
		return mheight;
	}

	public void setMheight(int mheight)
	{
		this.mheight = mheight;
	}

	@Override
	public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int widthSpec,
						  int heightSpec)
	{
		final int widthMode = View.MeasureSpec.getMode(widthSpec);
		final int heightMode = View.MeasureSpec.getMode(heightSpec);
		final int widthSize = View.MeasureSpec.getSize(widthSpec);
		final int heightSize = View.MeasureSpec.getSize(heightSpec);

		int width = 0;
		int height = 0;
		int count = getItemCount();
		int span = getSpanCount();
		for (int i = 0; i < count; i++)
		{
			measureScrapChild(recycler, i,
				View.MeasureSpec.makeMeasureSpec(i, View.MeasureSpec.UNSPECIFIED),
				View.MeasureSpec.makeMeasureSpec(i, View.MeasureSpec.UNSPECIFIED),
				mMeasuredDimension);

			if (getOrientation() == HORIZONTAL)
			{
				if (i % span == 0)
				{
					width = width + mMeasuredDimension[0];
				}
				if (i == 0)
				{
					height = mMeasuredDimension[1];
				}
			}
			else
			{
				if (i % span == 0)
				{
					height = height + mMeasuredDimension[1];
				}
				if (i == 0)
				{
					width = mMeasuredDimension[0];
				}
			}
		}

		switch (widthMode)
		{
			case View.MeasureSpec.EXACTLY:
				width = widthSize;
			case View.MeasureSpec.AT_MOST:
			case View.MeasureSpec.UNSPECIFIED:
		}

		switch (heightMode)
		{
			case View.MeasureSpec.EXACTLY:
				height = heightSize;
			case View.MeasureSpec.AT_MOST:
			case View.MeasureSpec.UNSPECIFIED:
		}
		setMheight(height);
		setMwidth(width);
		setMeasuredDimension(width, height);
	}

	private void measureScrapChild(RecyclerView.Recycler recycler, int position, int widthSpec,
								   int heightSpec, int[] measuredDimension)
	{
		if (position < getItemCount())
		{
			try
			{
				View view = recycler.getViewForPosition(0);//fix 动态添加时报IndexOutOfBoundsException
				if (view != null)
				{
					RecyclerView.LayoutParams p =
						(RecyclerView.LayoutParams) view.getLayoutParams();
					int childWidthSpec = ViewGroup.getChildMeasureSpec(widthSpec,
						getPaddingLeft() + getPaddingRight(), p.width);
					int childHeightSpec = ViewGroup.getChildMeasureSpec(heightSpec,
						getPaddingTop() + getPaddingBottom(), p.height);
					view.measure(childWidthSpec, childHeightSpec);
					measuredDimension[0] = view.getMeasuredWidth() + p.leftMargin + p.rightMargin;
					measuredDimension[1] = view.getMeasuredHeight() + p.bottomMargin + p.topMargin;
					recycler.recycleView(view);
				}
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}