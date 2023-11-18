public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String error);
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
            if (i != 33) {
                callback.onDone("Task " + i + " is done.");
            } else {
                errorCallback.onError("Task " + i + " finnished with error!");
                break;
            }
        }
    }

}
