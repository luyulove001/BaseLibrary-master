// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PTNWebViewFragment$$ViewBinder<T extends talex.zsw.baseproject.fragment.PTNWebViewFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427778, "field 'webView'");
    target.webView = finder.castView(view, 2131427778, "field 'webView'");
  }

  @Override public void unbind(T target) {
    target.webView = null;
  }
}
