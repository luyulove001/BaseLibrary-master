// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SliderLayoutActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.SliderLayoutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427663, "field 'mSlider'");
    target.mSlider = finder.castView(view, 2131427663, "field 'mSlider'");
    view = finder.findRequiredView(source, 2131427664, "field 'mPagerIndicator'");
    target.mPagerIndicator = finder.castView(view, 2131427664, "field 'mPagerIndicator'");
  }

  @Override public void unbind(T target) {
    target.mSlider = null;
    target.mPagerIndicator = null;
  }
}
