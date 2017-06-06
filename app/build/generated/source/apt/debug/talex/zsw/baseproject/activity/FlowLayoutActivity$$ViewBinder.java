// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FlowLayoutActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.FlowLayoutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427557, "field 'mFlowLayout'");
    target.mFlowLayout = finder.castView(view, 2131427557, "field 'mFlowLayout'");
    view = finder.findRequiredView(source, 2131427558, "field 'mTextView'");
    target.mTextView = finder.castView(view, 2131427558, "field 'mTextView'");
  }

  @Override public void unbind(T target) {
    target.mFlowLayout = null;
    target.mTextView = null;
  }
}
