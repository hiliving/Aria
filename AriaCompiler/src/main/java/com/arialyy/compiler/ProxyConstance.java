/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.compiler;

/**
 * Created by lyy on 2017/6/7.
 */

public interface ProxyConstance {
  /**
   * 设置观察者的方法
   */
  String SET_LISTENER = "setListener";

  /**
   * 下载的动态生成的代理类后缀
   */
  String DOWNLOAD_PROXY_CLASS_SUFFIX = "$$DownloadListenerProxy";

  /**
   * 上传的动态生成的代理类后缀
   */
  String UPLOAD_PROXY_CLASS_SUFFIX = "$$UploadListenerProxy";

}
