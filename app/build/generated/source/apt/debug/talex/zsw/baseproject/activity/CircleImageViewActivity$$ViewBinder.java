// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CircleImageViewActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.CircleImageViewActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427523, "field 'mImage'");
    target.mImage = finder.castView(view, 2131427523, "field 'mImage'");
  }

  @Override public void unbind(T target) {
    target.mImage = null;
  }
}
