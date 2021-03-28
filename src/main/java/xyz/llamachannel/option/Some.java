package xyz.llamachannel.option;

public record Some<T>(T value) implements Option<T> {
  @Override
  public boolean isSome() {
    return true;
  }

  @Override
  public boolean isNone() {
    return false;
  }

  @Override
  public T unwrap() {
    return this.value;
  }
}