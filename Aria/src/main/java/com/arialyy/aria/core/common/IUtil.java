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

package com.arialyy.aria.core.common;

/**
 * Created by lyy on 2016/10/31.
 * 任务功能接口
 */
public interface IUtil {

  /**
   * 获取文件大小
   */
  long getFileSize();

  /**
   * 获取当前位置
   */
  long getCurrentLocation();

  /**
   * 任务是否正在执行
   *
   * @return {@code true} 任务正在执行
   */
  boolean isRunning();

  /**
   * 取消
   */
  void cancel();

  /**
   * 停止
   */
  void stop();

  /**
   * 开始
   */
  void start();

  /**
   * 从上次断点恢复
   */
  void resume();

  /**
   * 设置最大下载/上传速度
   *
   * @param speed 单位：kb
   */
  void setMaxSpeed(int speed);
}