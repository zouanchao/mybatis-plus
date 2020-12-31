/*
 * Copyright (c) 2011-2020, baomidou (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baomidou.mybatisplus.core.enums;

import java.io.Serializable;

/**
 * 自定义枚举接口
 *
 * @author hubin
 * @since 2017-10-11
 * @deprecated 3.4.0
 */
@Deprecated
public interface IEnum<T extends Serializable> extends com.baomidou.mybatisplus.annotation.IEnum<T> {
}
