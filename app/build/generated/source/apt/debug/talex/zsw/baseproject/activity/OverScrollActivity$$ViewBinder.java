// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class OverScrollActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.OverScrollActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427517, "field 'text'");
    target.text = finder.castView(view, 2131427517, "field 'text'");
    view = finder.findRequiredView(source, 2131427469, "field 'image'");
    target.image = finder.castView(view, 2131427469, "field 'image'");
    view = finder.findRequiredView(source, 2131427620, "field 'chronometer'");
    target.chronometer = finder.castView(view, 2131427620, "field 'chronometer'");
  }

  @Override public void unbind(T target) {
    target.text = null;
    target.image = null;
    target.chronometer = null;
  }
}
