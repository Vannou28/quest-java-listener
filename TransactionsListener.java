public interface TransactionsListener {

    /**
     * the sign process is in progress
     */
    void onLoading();

    /**
     * calcule effectué
     */
    void onSuccess();

    /**
     * @param error returns the error message
     */
    void onError(String error);
}