// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RippleViewActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.RippleViewActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427650, "field 'more'");
    target.more = finder.castView(view, 2131427650, "field 'more'");
    view = finder.findRequiredView(source, 2131427651, "field 'more2'");
    target.more2 = finder.castView(view, 2131427651, "field 'more2'");
    view = finder.findRequiredView(source, 2131427649, "field 'actionbar'");
    target.actionbar = finder.castView(view, 2131427649, "field 'actionbar'");
    view = finder.findRequiredView(source, 2131427652, "field 'rectChild'");
    target.rectChild = finder.castView(view, 2131427652, "field 'rectChild'");
    view = finder.findRequiredView(source, 2131427427, "field 'rect'");
    target.rect = finder.castView(view, 2131427427, "field 'rect'");
    view = finder.findRequiredView(source, 2131427653, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131427653, "field 'recyclerView'");
  }

  @Override public void unbind(T target) {
    target.more = null;
    target.more2 = null;
    target.actionbar = null;
    target.rectChild = null;
    target.rect = null;
    target.recyclerView = null;
  }
}
