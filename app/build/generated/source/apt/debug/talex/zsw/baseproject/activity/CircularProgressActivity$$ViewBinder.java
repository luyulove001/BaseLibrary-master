// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CircularProgressActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.CircularProgressActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427469, "field 'image'");
    target.image = finder.castView(view, 2131427469, "field 'image'");
  }

  @Override public void unbind(T target) {
    target.image = null;
  }
}
