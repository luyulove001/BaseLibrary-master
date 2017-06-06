// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CircularRevealActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.CircularRevealActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427524, "field 'mCardsGroup'");
    target.mCardsGroup = finder.castView(view, 2131427524, "field 'mCardsGroup'");
    view = finder.findRequiredView(source, 2131427525, "field 'mFloatingButton'");
    target.mFloatingButton = finder.castView(view, 2131427525, "field 'mFloatingButton'");
    view = finder.findRequiredView(source, 2131427526, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131427526, "field 'mToolbar'");
  }

  @Override public void unbind(T target) {
    target.mCardsGroup = null;
    target.mFloatingButton = null;
    target.mToolbar = null;
  }
}
