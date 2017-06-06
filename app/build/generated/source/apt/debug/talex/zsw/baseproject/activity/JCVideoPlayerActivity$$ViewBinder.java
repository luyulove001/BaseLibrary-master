// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class JCVideoPlayerActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.JCVideoPlayerActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427575, "field 'videoController1'");
    target.videoController1 = finder.castView(view, 2131427575, "field 'videoController1'");
    view = finder.findRequiredView(source, 2131427576, "field 'videoController2'");
    target.videoController2 = finder.castView(view, 2131427576, "field 'videoController2'");
    view = finder.findRequiredView(source, 2131427577, "field 'videoController3'");
    target.videoController3 = finder.castView(view, 2131427577, "field 'videoController3'");
    view = finder.findRequiredView(source, 2131427578, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131427578, "field 'mRecyclerView'");
  }

  @Override public void unbind(T target) {
    target.videoController1 = null;
    target.videoController2 = null;
    target.videoController3 = null;
    target.mRecyclerView = null;
  }
}
