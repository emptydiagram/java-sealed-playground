package xyz.llamachannel.result;

public record Err<T, E>(E error) implements Result {
  @Override
  public boolean isOk() {
    return false;
  }

  @Override
  public boolean isErr() {
    return true;
  }

  @Override
  public T unwrap() {
    throw new UnsupportedOperationException("Cannot unwrap Err");
  }

  @Override
  public E unwrapErr() {
    return this.error;
  }
}