// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `Hello.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

public interface HelloPrx extends Ice.ObjectPrx
{
    public String sayHello(int delay)
        throws RequestCanceledException;

    public String sayHello(int delay, java.util.Map<String, String> __ctx)
        throws RequestCanceledException;

    public Ice.AsyncResult begin_sayHello(int delay);

    public Ice.AsyncResult begin_sayHello(int delay, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_sayHello(int delay, Ice.Callback __cb);

    public Ice.AsyncResult begin_sayHello(int delay, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_sayHello(int delay, Callback_Hello_sayHello __cb);

    public Ice.AsyncResult begin_sayHello(int delay, java.util.Map<String, String> __ctx, Callback_Hello_sayHello __cb);

    public String end_sayHello(Ice.AsyncResult __result)
        throws RequestCanceledException;

    public void shutdown();

    public void shutdown(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_shutdown();

    public Ice.AsyncResult begin_shutdown(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_shutdown(Ice.Callback __cb);

    public Ice.AsyncResult begin_shutdown(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_shutdown(Callback_Hello_shutdown __cb);

    public Ice.AsyncResult begin_shutdown(java.util.Map<String, String> __ctx, Callback_Hello_shutdown __cb);

    public void end_shutdown(Ice.AsyncResult __result);
}
