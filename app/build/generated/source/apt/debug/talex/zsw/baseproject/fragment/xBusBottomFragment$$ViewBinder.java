// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class xBusBottomFragment$$ViewBinder<T extends talex.zsw.baseproject.fragment.xBusBottomFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427786, "field 'demoRxbusTapCount'");
    target.demoRxbusTapCount = finder.castView(view, 2131427786, "field 'demoRxbusTapCount'");
    view = finder.findRequiredView(source, 2131427787, "field 'demoRxbusTapTxt'");
    target.demoRxbusTapTxt = finder.castView(view, 2131427787, "field 'demoRxbusTapTxt'");
  }

  @Override public void unbind(T target) {
    target.demoRxbusTapCount = null;
    target.demoRxbusTapTxt = null;
  }
}
