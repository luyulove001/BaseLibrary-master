// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends talex.zsw.baseproject.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427595, "field 'mListView'");
    target.mListView = finder.castView(view, 2131427595, "field 'mListView'");
  }

  @Override public void unbind(T target) {
    target.mListView = null;
  }
}
