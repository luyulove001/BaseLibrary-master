// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MarqueeRecyclerActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.MarqueeRecyclerActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427598, "field 'mMarqueeRecyclerView'");
    target.mMarqueeRecyclerView = finder.castView(view, 2131427598, "field 'mMarqueeRecyclerView'");
  }

  @Override public void unbind(T target) {
    target.mMarqueeRecyclerView = null;
  }
}
