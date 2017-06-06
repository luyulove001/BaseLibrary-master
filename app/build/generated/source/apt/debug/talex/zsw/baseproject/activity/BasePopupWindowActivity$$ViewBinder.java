// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BasePopupWindowActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.BasePopupWindowActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427623, "field 'mComment'");
    target.mComment = finder.castView(view, 2131427623, "field 'mComment'");
    view = finder.findRequiredView(source, 2131427624, "field 'mDialog'");
    target.mDialog = finder.castView(view, 2131427624, "field 'mDialog'");
    view = finder.findRequiredView(source, 2131427625, "field 'mInput'");
    target.mInput = finder.castView(view, 2131427625, "field 'mInput'");
    view = finder.findRequiredView(source, 2131427626, "field 'mList'");
    target.mList = finder.castView(view, 2131427626, "field 'mList'");
    view = finder.findRequiredView(source, 2131427627, "field 'mMenu'");
    target.mMenu = finder.castView(view, 2131427627, "field 'mMenu'");
    view = finder.findRequiredView(source, 2131427628, "field 'mScale'");
    target.mScale = finder.castView(view, 2131427628, "field 'mScale'");
    view = finder.findRequiredView(source, 2131427629, "field 'mSlideFrom'");
    target.mSlideFrom = finder.castView(view, 2131427629, "field 'mSlideFrom'");
    view = finder.findRequiredView(source, 2131427630, "field 'mTest'");
    target.mTest = finder.castView(view, 2131427630, "field 'mTest'");
    view = finder.findRequiredView(source, 2131427631, "field 'jelly'");
    target.jelly = finder.castView(view, 2131427631, "field 'jelly'");
    view = finder.findRequiredView(source, 2131427632, "field 'anti'");
    target.anti = finder.castView(view, 2131427632, "field 'anti'");
    view = finder.findRequiredView(source, 2131427633, "field 'anti2'");
    target.anti2 = finder.castView(view, 2131427633, "field 'anti2'");
    view = finder.findRequiredView(source, 2131427634, "field 'overshoot'");
    target.overshoot = finder.castView(view, 2131427634, "field 'overshoot'");
    view = finder.findRequiredView(source, 2131427635, "field 'spring'");
    target.spring = finder.castView(view, 2131427635, "field 'spring'");
  }

  @Override public void unbind(T target) {
    target.mComment = null;
    target.mDialog = null;
    target.mInput = null;
    target.mList = null;
    target.mMenu = null;
    target.mScale = null;
    target.mSlideFrom = null;
    target.mTest = null;
    target.jelly = null;
    target.anti = null;
    target.anti2 = null;
    target.overshoot = null;
    target.spring = null;
  }
}
