package models.iot;

/**
 * Created by hackeru on 01/12/2016.
 */
public interface IOTStatus<T> {
    T getStatus();
    void setStatus(T status);
}
