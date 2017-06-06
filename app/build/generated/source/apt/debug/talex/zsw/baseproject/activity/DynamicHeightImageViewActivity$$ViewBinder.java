// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DynamicHeightImageViewActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.DynamicHeightImageViewActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427547, "field 'image1'");
    target.image1 = finder.castView(view, 2131427547, "field 'image1'");
    view = finder.findRequiredView(source, 2131427548, "field 'image2'");
    target.image2 = finder.castView(view, 2131427548, "field 'image2'");
  }

  @Override public void unbind(T target) {
    target.image1 = null;
    target.image2 = null;
  }
}
