package Detectors

import Detector

class EmailDetector(): Detector()  {

    override fun DetectorType(): String {
        return "Binary"
    }
}