// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NiceSpinnerActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.NiceSpinnerActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427609, "field 'mNiceSpinner'");
    target.mNiceSpinner = finder.castView(view, 2131427609, "field 'mNiceSpinner'");
  }

  @Override public void unbind(T target) {
    target.mNiceSpinner = null;
  }
}
