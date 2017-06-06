// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ExpandablePanelActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.ExpandablePanelActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427556, "field 'view'");
    target.view = view;
    view = finder.findRequiredView(source, 2131427554, "field 'expand'");
    target.expand = finder.castView(view, 2131427554, "field 'expand'");
    view = finder.findRequiredView(source, 2131427555, "field 'expandL'");
    target.expandL = finder.castView(view, 2131427555, "field 'expandL'");
    view = finder.findRequiredView(source, 2131427553, "field 'value'");
    target.value = finder.castView(view, 2131427553, "field 'value'");
    view = finder.findRequiredView(source, 2131427552, "field 'expandablePanel'");
    target.expandablePanel = finder.castView(view, 2131427552, "field 'expandablePanel'");
  }

  @Override public void unbind(T target) {
    target.view = null;
    target.expand = null;
    target.expandL = null;
    target.value = null;
    target.expandablePanel = null;
  }
}
