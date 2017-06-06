// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ProgressActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.ProgressActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427636, "field 'mTabLayout'");
    target.mTabLayout = finder.castView(view, 2131427636, "field 'mTabLayout'");
    view = finder.findRequiredView(source, 2131427542, "field 'mFrameLayout'");
    target.mFrameLayout = finder.castView(view, 2131427542, "field 'mFrameLayout'");
    view = finder.findRequiredView(source, 2131427637, "field 'mViewPager'");
    target.mViewPager = finder.castView(view, 2131427637, "field 'mViewPager'");
  }

  @Override public void unbind(T target) {
    target.mTabLayout = null;
    target.mFrameLayout = null;
    target.mViewPager = null;
  }
}
