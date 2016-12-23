package com.jack.ddtally.presenter;

import android.support.annotation.NonNull;

import com.google.common.base.Preconditions;
import com.jack.ddtally.base.RxPresenter;
import com.jack.ddtally.presenter.contract.MainContract;

/**
 * Created by John on 2016/12/23.
 */

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {

    public MainPresenter(@NonNull MainContract.View oneView) {
        attachView(Preconditions.checkNotNull(oneView));
    }

}
