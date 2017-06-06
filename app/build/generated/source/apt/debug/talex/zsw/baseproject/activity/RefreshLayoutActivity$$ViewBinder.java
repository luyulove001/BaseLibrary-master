// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RefreshLayoutActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.RefreshLayoutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427595, "field 'mListView'");
    target.mListView = finder.castView(view, 2131427595, "field 'mListView'");
    view = finder.findRequiredView(source, 2131427648, "field 'mRefreshLayout'");
    target.mRefreshLayout = finder.castView(view, 2131427648, "field 'mRefreshLayout'");
  }

  @Override public void unbind(T target) {
    target.mListView = null;
    target.mRefreshLayout = null;
  }
}
