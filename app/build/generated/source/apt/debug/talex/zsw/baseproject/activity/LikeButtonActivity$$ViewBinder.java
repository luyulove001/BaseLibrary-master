// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LikeButtonActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.LikeButtonActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427580, "field 'starButton'");
    target.starButton = finder.castView(view, 2131427580, "field 'starButton'");
    view = finder.findRequiredView(source, 2131427581, "field 'heartButton'");
    target.heartButton = finder.castView(view, 2131427581, "field 'heartButton'");
    view = finder.findRequiredView(source, 2131427582, "field 'thumbButton'");
    target.thumbButton = finder.castView(view, 2131427582, "field 'thumbButton'");
    view = finder.findRequiredView(source, 2131427583, "field 'smileButton'");
    target.smileButton = finder.castView(view, 2131427583, "field 'smileButton'");
  }

  @Override public void unbind(T target) {
    target.starButton = null;
    target.heartButton = null;
    target.thumbButton = null;
    target.smileButton = null;
  }
}
