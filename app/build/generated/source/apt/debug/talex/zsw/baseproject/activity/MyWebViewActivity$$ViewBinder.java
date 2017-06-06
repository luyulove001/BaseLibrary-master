// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MyWebViewActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.MyWebViewActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427602, "field 'mProgressBar'");
    target.mProgressBar = finder.castView(view, 2131427602, "field 'mProgressBar'");
    view = finder.findRequiredView(source, 2131427603, "field 'mWebView'");
    target.mWebView = finder.castView(view, 2131427603, "field 'mWebView'");
    view = finder.findRequiredView(source, 2131427604, "field 'mRichText'");
    target.mRichText = finder.castView(view, 2131427604, "field 'mRichText'");
  }

  @Override public void unbind(T target) {
    target.mProgressBar = null;
    target.mWebView = null;
    target.mRichText = null;
  }
}
