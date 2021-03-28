package xyz.llamachannel.result;

public record Ok<T, E>(T value) implements Result {
  @Override
  public boolean isOk() {
    return true;
  }

  @Override
  public boolean isErr() {
    return false;
  }

  @Override
  public T unwrap() {
    return this.value;
  }

  @Override
  public E unwrapErr() {
    throw new UnsupportedOperationException("Cannot unwrapErr Ok");
  }
}
