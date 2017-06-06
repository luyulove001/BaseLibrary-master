// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PullZoomViewActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.PullZoomViewActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427641, "field 'mScrollView'");
    target.mScrollView = finder.castView(view, 2131427641, "field 'mScrollView'");
  }

  @Override public void unbind(T target) {
    target.mScrollView = null;
  }
}
