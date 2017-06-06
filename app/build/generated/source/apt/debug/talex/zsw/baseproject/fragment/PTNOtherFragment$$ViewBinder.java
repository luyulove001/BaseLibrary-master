// Generated code from Butter Knife. Do not modify!
package talex.zsw.baseproject.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PTNOtherFragment$$ViewBinder<T extends talex.zsw.baseproject.fragment.PTNOtherFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427773, "field 'nameTV'");
    target.nameTV = finder.castView(view, 2131427773, "field 'nameTV'");
    view = finder.findRequiredView(source, 2131427774, "field 'birthdayTV'");
    target.birthdayTV = finder.castView(view, 2131427774, "field 'birthdayTV'");
    view = finder.findRequiredView(source, 2131427469, "field 'image'");
    target.image = finder.castView(view, 2131427469, "field 'image'");
  }

  @Override public void unbind(T target) {
    target.nameTV = null;
    target.birthdayTV = null;
    target.image = null;
  }
}
