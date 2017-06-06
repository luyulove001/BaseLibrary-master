// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AndroidAnimationsActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.AndroidAnimationsActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427512, "field 'mTarget'");
    target.mTarget = finder.castView(view, 2131427512, "field 'mTarget'");
    view = finder.findRequiredView(source, 2131427513, "field 'mListView'");
    target.mListView = finder.castView(view, 2131427513, "field 'mListView'");
  }

  @Override public void unbind(T target) {
    target.mTarget = null;
    target.mListView = null;
  }
}
