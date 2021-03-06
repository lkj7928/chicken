package com.nene.chicken.Presentation.Presenter;

import com.nene.chicken.Model.TransPosition;

import java.util.List;

/**
 * Created by ParkHaeSung on 2017-09-16.
 */

public interface MainPresenter {
    void setView(View view);
    interface View extends BaseViewPresenter{

        void drawPath(List<TransPosition> positions);
    }
}
