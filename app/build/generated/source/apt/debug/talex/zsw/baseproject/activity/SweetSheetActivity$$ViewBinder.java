// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SweetSheetActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.SweetSheetActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427683, "field 'actionRecyclerView'");
    target.actionRecyclerView = finder.castView(view, 2131427683, "field 'actionRecyclerView'");
    view = finder.findRequiredView(source, 2131427684, "field 'actionViewpager'");
    target.actionViewpager = finder.castView(view, 2131427684, "field 'actionViewpager'");
    view = finder.findRequiredView(source, 2131427685, "field 'actionCustom'");
    target.actionCustom = finder.castView(view, 2131427685, "field 'actionCustom'");
    view = finder.findRequiredView(source, 2131427682, "field 'rl'");
    target.rl = finder.castView(view, 2131427682, "field 'rl'");
  }

  @Override public void unbind(T target) {
    target.actionRecyclerView = null;
    target.actionViewpager = null;
    target.actionCustom = null;
    target.rl = null;
  }
}
