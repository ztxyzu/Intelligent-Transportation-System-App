package com.example.administrator.its_gs_mvp.ui.fragment;

import com.example.administrator.its_gs_mvp.R;
import com.example.administrator.its_gs_mvp.mvp.AccountContract;
import com.example.administrator.its_gs_mvp.mvp.presenter.account.AccountPresenterImpl;
import com.example.administrator.its_gs_mvp.mvp.view.BaseFragmentImpl;

/**
 * Created by Administrator on 2018/4/9 0009.
 */

public class Fragment_Account extends BaseFragmentImpl<AccountContract.View, AccountPresenterImpl>
        implements AccountContract.View {

    @Override
    protected AccountPresenterImpl initPresenter() {
        return new AccountPresenterImpl();
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_account;
    }

    @Override
    protected void initView() {

    }
}