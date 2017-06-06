// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ScrollerNumberPickerActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.ScrollerNumberPickerActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427660, "field 'mPicker1'");
    target.mPicker1 = finder.castView(view, 2131427660, "field 'mPicker1'");
    view = finder.findRequiredView(source, 2131427661, "field 'mPicker2'");
    target.mPicker2 = finder.castView(view, 2131427661, "field 'mPicker2'");
    view = finder.findRequiredView(source, 2131427662, "field 'mPicker3'");
    target.mPicker3 = finder.castView(view, 2131427662, "field 'mPicker3'");
    view = finder.findRequiredView(source, 2131427558, "field 'mTextView'");
    target.mTextView = finder.castView(view, 2131427558, "field 'mTextView'");
  }

  @Override public void unbind(T target) {
    target.mPicker1 = null;
    target.mPicker2 = null;
    target.mPicker3 = null;
    target.mTextView = null;
  }
}
