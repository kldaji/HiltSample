<h1 align="center">Hilt Sample Demo Project</h1></br>

<p align="center">
Hilt에 대한 이해도를 높이고자 Github API를 사용하여 구현한 아주 간단한 샘플 데모 프로젝트입니다.
</p>

<p align="center">
  <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>
  <a href="https://medium.com/@kldaji/simple-hilt-android-demo-5bf6eecacff4"><img alt="Medium" src="https://img.shields.io/badge/Story-Medium-orange"/></a>
  <a href="https://github.com/kldaji"><img alt="Profile" src="https://img.shields.io/badge/Github-kldaji-blue"/></a> 
</p>

## Screenshots

<p>
    <img src="https://user-images.githubusercontent.com/78070388/164399888-0187e9b0-80d0-4f3c-8b1d-e2dc936a4465.gif" width="320px" height="640px"/>
</p>

## Tech stack
- Minimum SDK level 21
- 100% [Kotlin](https://kotlinlang.org/) based + [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous.
- Hilt for dependency injection.
- JetPack
  - Lifecycle - dispose observing data when lifecycle state changes.
  - ViewModel - UI related data holder, lifecycle aware.
- Architecture
  - MVVM Architecture (Declarative View - ViewModel - Model)
  - Repository pattern
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit) - construct REST APIs


## API
- [Github](https://api.github.com/)

