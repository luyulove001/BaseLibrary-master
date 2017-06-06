// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PTNScrollViewActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.PTNScrollViewActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427640, "field 'pullToNextLayout'");
    target.pullToNextLayout = finder.castView(view, 2131427640, "field 'pullToNextLayout'");
  }

  @Override public void unbind(T target) {
    target.pullToNextLayout = null;
  }
}
