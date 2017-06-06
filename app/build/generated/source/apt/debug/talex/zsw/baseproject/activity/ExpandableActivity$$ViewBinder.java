// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ExpandableActivity$$ViewBinder<T extends talex.zsw.baseproject.activity.ExpandableActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427550, "field 'expandableLayout'");
    target.expandableLayout = finder.castView(view, 2131427550, "field 'expandableLayout'");
    view = finder.findRequiredView(source, 2131427551, "field 'expandableLayoutListView'");
    target.expandableLayoutListView = finder.castView(view, 2131427551, "field 'expandableLayoutListView'");
    view = finder.findRequiredView(source, 2131427549, "field 'mOverScrollView'");
    target.mOverScrollView = finder.castView(view, 2131427549, "field 'mOverScrollView'");
    view = finder.findRequiredView(source, 2131427980, "field 'mImageView'");
    target.mImageView = finder.castView(view, 2131427980, "field 'mImageView'");
    view = finder.findRequiredView(source, 2131427979, "field 'header_text'");
    target.header_text = finder.castView(view, 2131427979, "field 'header_text'");
    view = finder.findRequiredView(source, 2131427537, "field 'button'");
    target.button = finder.castView(view, 2131427537, "field 'button'");
    view = finder.findRequiredView(source, 2131427517, "field 'text'");
    target.text = finder.castView(view, 2131427517, "field 'text'");
  }

  @Override public void unbind(T target) {
    target.expandableLayout = null;
    target.expandableLayoutListView = null;
    target.mOverScrollView = null;
    target.mImageView = null;
    target.header_text = null;
    target.button = null;
    target.text = null;
  }
}
