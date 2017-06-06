// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TestActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.TestActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427696, "field 'mTvOld'");
    target.mTvOld = finder.castView(view, 2131427696, "field 'mTvOld'");
    view = finder.findRequiredView(source, 2131427697, "field 'mTvOld2'");
    target.mTvOld2 = finder.castView(view, 2131427697, "field 'mTvOld2'");
  }

  @Override public void unbind(T target) {
    target.mTvOld = null;
    target.mTvOld2 = null;
  }
}
