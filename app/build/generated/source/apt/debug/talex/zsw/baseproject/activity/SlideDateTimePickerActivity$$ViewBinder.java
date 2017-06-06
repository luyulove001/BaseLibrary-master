// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SlideDateTimePickerActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.SlideDateTimePickerActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427558, "field 'mTextView'");
    target.mTextView = finder.castView(view, 2131427558, "field 'mTextView'");
  }

  @Override public void unbind(T target) {
    target.mTextView = null;
  }
}
