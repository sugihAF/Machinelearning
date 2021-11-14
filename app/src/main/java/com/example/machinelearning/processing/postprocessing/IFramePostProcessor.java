package com.example.machinelearning.processing.postprocessing;

import com.example.machinelearning.imaging.IFrame;

public interface IFramePostProcessor {

    IFrame postProcess(IFrame inputFrame);

}
