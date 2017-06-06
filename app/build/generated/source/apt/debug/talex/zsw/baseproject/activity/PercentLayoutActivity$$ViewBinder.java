// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PercentLayoutActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.PercentLayoutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427621, "field 'mTabLayout'");
    target.mTabLayout = finder.castView(view, 2131427621, "field 'mTabLayout'");
    view = finder.findRequiredView(source, 2131427527, "field 'content'");
    target.content = finder.castView(view, 2131427527, "field 'content'");
    view = finder.findRequiredView(source, 2131427622, "field 'mPager'");
    target.mPager = finder.castView(view, 2131427622, "field 'mPager'");
  }

  @Override public void unbind(T target) {
    target.mTabLayout = null;
    target.content = null;
    target.mPager = null;
  }
}
