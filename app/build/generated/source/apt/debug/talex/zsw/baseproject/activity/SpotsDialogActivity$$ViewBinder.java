// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SpotsDialogActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.SpotsDialogActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 16908313, "field 'button1'");
    target.button1 = finder.castView(view, 16908313, "field 'button1'");
    view = finder.findRequiredView(source, 16908314, "field 'button2'");
    target.button2 = finder.castView(view, 16908314, "field 'button2'");
    view = finder.findRequiredView(source, 16908315, "field 'button3'");
    target.button3 = finder.castView(view, 16908315, "field 'button3'");
    view = finder.findRequiredView(source, 16908327, "field 'closeButton'");
    target.closeButton = finder.castView(view, 16908327, "field 'closeButton'");
  }

  @Override public void unbind(T target) {
    target.button1 = null;
    target.button2 = null;
    target.button3 = null;
    target.closeButton = null;
  }
}
