// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PTNScrollViewFragment$$ViewBinder<T extends talex.zsw.baseproject.fragment.PTNScrollViewFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427776, "field 'titleTV'");
    target.titleTV = finder.castView(view, 2131427776, "field 'titleTV'");
    view = finder.findRequiredView(source, 2131427777, "field 'textView'");
    target.textView = finder.castView(view, 2131427777, "field 'textView'");
  }

  @Override public void unbind(T target) {
    target.titleTV = null;
    target.textView = null;
  }
}
