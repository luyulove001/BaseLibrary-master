// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AnimationActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.AnimationActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427515, "field 'mountain'");
    target.mountain = finder.castView(view, 2131427515, "field 'mountain'");
    view = finder.findRequiredView(source, 2131427516, "field 'percent'");
    target.percent = finder.castView(view, 2131427516, "field 'percent'");
    view = finder.findRequiredView(source, 2131427469, "field 'image'");
    target.image = finder.castView(view, 2131427469, "field 'image'");
    view = finder.findRequiredView(source, 2131427517, "field 'text'");
    target.text = finder.castView(view, 2131427517, "field 'text'");
    view = finder.findRequiredView(source, 2131427518, "field 'parallel'");
    target.parallel = finder.castView(view, 2131427518, "field 'parallel'");
    view = finder.findRequiredView(source, 2131427519, "field 'sequentially'");
    target.sequentially = finder.castView(view, 2131427519, "field 'sequentially'");
  }

  @Override public void unbind(T target) {
    target.mountain = null;
    target.percent = null;
    target.image = null;
    target.text = null;
    target.parallel = null;
    target.sequentially = null;
  }
}
