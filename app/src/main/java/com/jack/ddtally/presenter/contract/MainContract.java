package com.jack.ddtally.presenter.contract;

import com.jack.ddtally.base.BasePresenter;
import com.jack.ddtally.base.BaseView;

/**
 * Created by John on 2016/12/23.
 */

public interface MainContract {

    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePresenter<View>{

    }

}
