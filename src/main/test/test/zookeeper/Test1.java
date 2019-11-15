package test.zookeeper;

import org.apache.zookeeper.*;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @Package: test.zookeeper
 * @Author: HeXiaoBo
 * @CreateDate: 2019/11/15 11:28
 * @Description:
 **/
public class Test1 {

    /**
     * 计数器
     */
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    @Test
    public void create() throws Exception {
        /**
         * 创建zookeeper
         * 参数一:连接ip和端口
         * 参数二:超时时间
         * 参数三:事件通知
         */
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181", 5000, new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                if(event.getState() == Event.KeeperState.SyncConnected){
                    System.out.println("zk连接成功");
                    countDownLatch.countDown();
                }
            }
        });

        System.out.println("zk正在连接...");
        countDownLatch.await();
        System.out.println("开始创建节点");

        /**
         * 创建节点
         * 参数一:节点名称(路径名称)
         * 参数二:节点Value
         * 参数三:节点权限acl
         * 参数四:节点类型 四种 临时和持久(重要)
         */
        String s = zooKeeper.create("/hxb/hxb_son1", "节点创建".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(s);
        zooKeeper.close();
    }
}
