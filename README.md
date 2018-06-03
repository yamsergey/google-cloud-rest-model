![](https://circleci.com/gh/yamsergey/google-cloud-rest-model.png?style=shield&circle-token=b0f60d7d759493924298f4b3192e63709d87e6b0)
[![](https://jitpack.io/v/yamsergey/google-cloud-rest-model.svg)](https://jitpack.io/#yamsergey/google-cloud-rest-model)

# google-cloud-rest-model
This project was created to provide small library which can help access to Google Cloud API.
Google has it's own RPC library for Java, and it's better to use the library.

I've created this library for experiment purpose. It contains DTO objects to use with Google Cloud REST API.

# Usage

Add dependency to Jitpack

```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

Import desired dependency

```
dependencies {
  implementation 'com.github.yamsergey.google-cloud-rest-model:model:v0.1.0-alpha1'
}
```
> All in one

```
dependencies {
  implementation 'com.github.yamsergey.google-cloud-rest-model:core:v0.1.0-alpha1'
}
```
> Supported languages

```
dependencies {
  implementation 'com.github.yamsergey.google-cloud-rest-model:image-annotation:v0.1.0-alpha1'
}
```

```
dependencies {
  implementation 'com.github.yamsergey.google-cloud-rest-model:syntax:v0.1.0-alpha1'
}
```

```
dependencies {
  implementation 'com.github.yamsergey.google-cloud-rest-model:translation:v0.1.0-alpha1'
}
```