// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ProgressAccelerationFragment$$ViewBinder<T extends talex.zsw.baseproject.fragment.ProgressAccelerationFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427764, "field 'mAPComplete'");
    target.mAPComplete = finder.castView(view, 2131427764, "field 'mAPComplete'");
    view = finder.findRequiredView(source, 2131427765, "field 'mAPLoading'");
    target.mAPLoading = finder.castView(view, 2131427765, "field 'mAPLoading'");
    view = finder.findRequiredView(source, 2131427766, "field 'mAPTime'");
    target.mAPTime = finder.castView(view, 2131427766, "field 'mAPTime'");
  }

  @Override public void unbind(T target) {
    target.mAPComplete = null;
    target.mAPLoading = null;
    target.mAPTime = null;
  }
}
