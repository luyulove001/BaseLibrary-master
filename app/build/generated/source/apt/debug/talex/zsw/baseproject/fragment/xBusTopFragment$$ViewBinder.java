// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class xBusTopFragment$$ViewBinder<T extends talex.zsw.baseproject.fragment.xBusTopFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427788, "field 'btnDemoRxbusTap' and method 'onTapButtonClicked'");
    target.btnDemoRxbusTap = finder.castView(view, 2131427788, "field 'btnDemoRxbusTap'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onTapButtonClicked();
        }
      });
  }

  @Override public void unbind(T target) {
    target.btnDemoRxbusTap = null;
  }
}
